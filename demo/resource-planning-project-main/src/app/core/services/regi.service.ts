import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {User} from '../models/user.model';
import {Faculty} from '../models/faculty.model';

@Injectable({
  providedIn: 'root'
})
export class RegiService {

  constructor(private http: HttpClient) {
  }

  public signIn(user: User, faculty: Faculty): void {
    this.addDataToLocalStorage(user, faculty);
  }

  public logOut(): void {
    localStorage.removeItem('appData');
  }

  public addDataToLocalStorage(user: any, faculty: any, access_token?: any, ): void {
    const appData = {
      access_token,
      user,
      faculty,
    };
    localStorage.setItem('appData', JSON.stringify(appData));
  }

  public isLoggedIn(): boolean {
    return JSON.parse(localStorage.getItem('appData')) !== null;
  }

}

