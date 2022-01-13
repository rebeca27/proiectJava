import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {AuthService} from 'src/app/core/services/auth.service';
import {ClassroomService} from 'src/app/core/services/classroom.service';
import {SnackbarService} from 'src/app/core/services/snackbar.service';
import {faCalendarAlt, faHistory} from '@fortawesome/free-solid-svg-icons';
import {Subject} from 'rxjs';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {

  public currentUser;
  public currentFaculty = [] as any;
  public faHistory = faHistory;
  public faCalendarAlt = faCalendarAlt;
  public openHistoryModalSubject: Subject<any> = new Subject<any>();
  public openBookingModalSubject: Subject<any> = new Subject<any>();

  public tableData = [];

  constructor(
    public router: Router,
    private snackBar: SnackbarService,
    private authService: AuthService,
    private classroomService: ClassroomService
  ) {
  }

  ngOnInit(): void {
    this.setData();
    this.currentUser = this.authService.getUser();
    this.authService.getFaculty(this.currentUser.id_facultate).subscribe(data => {
      this.currentFaculty = data || [];
      console.log(this.currentFaculty[0]);
    });

    this.currentFaculty = this.authService.getFaculty(this.currentUser.id_facultate);

  }

  public openHistoryModal(classroomName, id): void {
    this.openHistoryModalSubject.next({classroomName, id});
  }

  public openBookingModal(classroomName, id): void {
    this.openBookingModalSubject.next({classroomName, id});
  }

  public doLogout(): void {
    this.authService.logOut();
    this.router.navigate(['/login']);
    this.snackBar.openSnackBar('Successfully logged out!', 'success-snackbar');
  }

  private setData(): void {
    this.classroomService.getClassrooms().subscribe(data => {
      data.forEach(classroom => {
        this.tableData.push(classroom);
      });
    });
  }

}
