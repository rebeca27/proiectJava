import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from "rxjs";
import {Classroom} from '../models/classroom.model';
import {User} from "../models/user.model";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }

  public registerUser(nume, prenume, permisiune, mail, parola): Observable<any> {
    let url = "http://localhost:8080/register";
    let params = new HttpParams().set("nume", nume).set("prenume", prenume).set("permisiune", permisiune).set("mail", mail).set("parola", parola);
    return this.http.post<any>(url, {}, {params: params});
  }

}
