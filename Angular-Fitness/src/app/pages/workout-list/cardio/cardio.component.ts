import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-cardio',
  standalone: false,
  templateUrl: './cardio.component.html',
  styleUrl: './cardio.component.css'
})
export class CardioComponent {

  cardioWorkouts: workout[] = [];
  
    constructor(private apiService: ApiService) {}
  
    ngOnInit() { // ✅ Now it will run!
      this.apiService.getCardio().subscribe({
        next: (data) => {
          console.log('API Response:', data); // ✅ Debugging
          this.cardioWorkouts = data.cardio || []; // ✅ Ensure `chest` exists
        },
        error: (error) => console.error('Error fetching workouts:', error)
      });
    }

}
