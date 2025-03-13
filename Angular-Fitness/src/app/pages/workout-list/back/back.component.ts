import { Component } from '@angular/core';
import { ApiService } from '../../../api.service';
import { workout } from '../../../workout';

@Component({
  selector: 'app-back',
  standalone: false,
  templateUrl: './back.component.html',
  styleUrl: './back.component.css'
})
export class BackComponent {

  BackWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getBack().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.BackWorkouts = data.abs || []; // ✅ Ensure `chest` exists
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }

}
