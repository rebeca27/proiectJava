import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {User} from '../models/user.model';
import {Faculty} from '../models/faculty.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {
  }

  public getUsers(): Observable<User[]> {
    const url = 'http://localhost:8080/login/';
    return this.http.get<User[]>(url);
  }

  public signIn(user: User): void {
    this.addDataToLocalStorage(user);
  }

  public logOut(): void {
    localStorage.removeItem('appData');
  }

  public addDataToLocalStorage(user: any, access_token?: any): void {
    const appData = {
      access_token,
      user,
    };
    localStorage.setItem('appData', JSON.stringify(appData));
  }

  public isLoggedIn(): boolean {
    return JSON.parse(localStorage.getItem('appData')) !== null;
  }

  public getToken(): string {
    return JSON.parse(localStorage.getItem('appData')).access_token;
  }

  public getUser(): any {
    return JSON.parse(localStorage.getItem('appData')).user;
  }

  public getFaculty(): any {
    return JSON.parse(localStorage.getItem('appData')).faculty;
  }

  public getUserId(): string {
    const localData = JSON.parse(localStorage.getItem('appData'));
    if (localData) {
      return localData.user.id;
    }
    return null;
  }

}

