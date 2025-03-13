import { Component } from '@angular/core';
import { workout } from '../../../workout';
import { ApiService } from '../../../api.service';

@Component({
  selector: 'app-abs',
  standalone: false,
  templateUrl: './abs.component.html',
  styleUrl: './abs.component.css'
})
export class AbsComponent {

  absWorkouts: workout[] = [];

  constructor(private apiService: ApiService) {}

  ngOnInit() { // ✅ Now it will run!
    this.apiService.getAbs().subscribe({
      next: (data) => {
        console.log('API Response:', data); // ✅ Debugging
        this.absWorkouts = data.abs || []; // ✅ Ensure `chest` exists
      },
      error: (error) => console.error('Error fetching workouts:', error)
    });
  }

}

