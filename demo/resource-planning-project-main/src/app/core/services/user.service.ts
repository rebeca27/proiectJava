import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }

  // tslint:disable-next-line:variable-name
  public registerUser(nume, prenume, permisiune, mail, parola, id_facultate): Observable<any> {
    const url = 'http://localhost:8080/register';
    // tslint:disable-next-line:max-line-length
    const params = new HttpParams().set('nume', nume).set('prenume', prenume).set('permisiune', permisiune).set('mail', mail).set('parola', parola).set('id_facultate', id_facultate);
    return this.http.post<any>(url, {}, {params});
  }

}
