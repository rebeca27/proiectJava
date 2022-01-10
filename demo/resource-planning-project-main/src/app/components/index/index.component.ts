
import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.scss']
})
export class IndexComponent implements OnInit {

  constructor(
    public router: Router,
  ) {
  }

  ngOnInit(): void {
  }


  public registerPage(): void {
    this.router.navigate(['/register']);
  }
  public loginPage(): void {
    this.router.navigate(['/login']);
  }

}
