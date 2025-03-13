import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private apiUrl = 'http://localhost:5000/'; // ✅ Ensure the correct path

  constructor(private http: HttpClient) {}

  getChest(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/chest`); // ✅ Ensure correct API path
  }
  getTriceps(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/triceps`); // ✅ Ensure correct API path
  }
  getBack(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/back`); // ✅ Ensure correct API path
  }
  getBiceps(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/biceps`); // ✅ Ensure correct API path
  }
  getAbs(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/abs`); // ✅ Ensure correct API path
  }
  getLegs(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/legs`); // ✅ Ensure correct API path
  }
  getCardio(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/cardio`); // ✅ Ensure correct API path
  }
  getShoulders(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/shoulders`); // ✅ Ensure correct API path
  }

}
