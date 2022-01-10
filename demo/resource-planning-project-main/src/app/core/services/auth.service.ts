import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient, HttpParams} from '@angular/common/http';
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

  public getFaculty(id: string): Observable<string[]> {
    const url = 'http://localhost:8080/facultate/';
    const params = new HttpParams().set('id', id);
    return this.http.get<string[]>(url,  {params});
  }


  public signIn(user: User): void {
    this.addDataToLocalStorage(user);
  }

  public signFac(faculty: Faculty): void {
    this.addDataToLocalStorageFac(faculty);
  }

  public logOut(): void {
    localStorage.removeItem('appData');
  }

  public addDataToLocalStorage(user: any, access_token?: any, ): void {
    const appData = {
      access_token,
      user,
    };
    localStorage.setItem('appData', JSON.stringify(appData));
  }


  public addDataToLocalStorageFac(faculty: any, access_token?: any, ): void {
    const appData = {
      access_token,
      faculty,
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

  public getUserId(): string {
    const localData = JSON.parse(localStorage.getItem('appData'));
    if (localData) {
      return localData.user.id;
    }
    return null;
  }

}

