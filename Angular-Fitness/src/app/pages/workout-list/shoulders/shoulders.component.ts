import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-shoulders',
  standalone: false,
  templateUrl: './shoulders.component.html',
  styleUrl: './shoulders.component.css'
})
export class ShouldersComponent {
  shoulderWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getShoulders().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.shoulderWorkouts = data.shoulders || []; // ✅ Ensure `chest` exists
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }
}
