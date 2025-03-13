import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-legs',
  standalone: false,
  templateUrl: './legs.component.html',
  styleUrl: './legs.component.css'
})
export class LegsComponent {

  legsWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getLegs().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.legsWorkouts = data.legs || []; // ✅ Ensure `chest` exists
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }

}
