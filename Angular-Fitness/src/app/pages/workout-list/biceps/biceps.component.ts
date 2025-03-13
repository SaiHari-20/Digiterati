import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-biceps',
  standalone: false,
  templateUrl: './biceps.component.html',
  styleUrl: './biceps.component.css'
})
export class BicepsComponent {
  bicepsWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getBiceps().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.bicepsWorkouts = data.biceps || []; 
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }

}
