import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {RegiService} from 'src/app/core/services/regi.service';
import {UserService} from '../../core/services/user.service';
import {SnackbarService} from 'src/app/core/services/snackbar.service';
import {Observable, Subscription} from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})

export class RegisterComponent implements OnInit {
  @Input() events: Observable<any>;
  public form: FormGroup;
  public hidePassword = true;

  constructor(
    public registerForm: FormBuilder,
    public router: Router,
    private snackBar: SnackbarService,
    private userService: UserService,
  ) {
  }

  ngOnInit(): void {
    this.initForm();
  }

  public initForm(): void {
    this.form = this.registerForm.group({
      firstname: ['', [Validators.required]],
      lastname: ['', [Validators.required]],
      status: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required],
      id_facultate: ['', Validators.required],
    });
  }

  // tslint:disable-next-line:typedef
  public registerUser() {
    this.userService.
    registerUser(
      this.form.value.firstname,
      this.form.value.lastname,
      this.form.value.status,
      this.form.value.email,
      this.form.value.password,
      this.form.value.id_facultate,
    )
      .subscribe( (data) => {
        this.snackBar.openSnackBar('Successfully register!', 'success-snackbar');
        this.form.reset();
      });
  }
}
