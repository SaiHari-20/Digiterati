import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-triceps',
  standalone: false,
  templateUrl: './triceps.component.html',
  styleUrl: './triceps.component.css'
})
export class TricepsComponent {

  tricepsWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getTriceps().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.tricepsWorkouts = data.triceps || []; // ✅ Ensure `chest` exists
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }

}
