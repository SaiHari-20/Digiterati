import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

@Component({
  selector: 'app-calculators',
  templateUrl: './calculators.component.html',
  styleUrls: ['./calculators.component.css'],
  standalone:false,
})
export class CalculatorsComponent {
  height: number = 0;
  weight: number = 0;
  age: number = 0;
  gender: string = 'male';
  activityLevel: string = 'sedentary';
  bmiResult: number | null = null;
  caloriesResult: number | null = null;

  calculateBMI() {
    if (this.height > 0 && this.weight > 0) {
      const heightInMeters = this.height / 100;
      this.bmiResult = parseFloat((this.weight / (heightInMeters * heightInMeters)).toFixed(2));
    } else {
      this.bmiResult = null;
    }
  }

  calculateCalories(): void {
    if (this.height > 0 && this.weight > 0 && this.age > 0) {
      let bmr: number;
      if (this.gender === 'male') {
        bmr = 88.362 + (13.397 * this.weight) + (4.799 * this.height) - (5.677 * this.age);
      } else {
        bmr = 447.593 + (9.247 * this.weight) + (3.098 * this.height) - (4.330 * this.age);
      }

      switch (this.activityLevel) {
        case 'sedentary':
          this.caloriesResult = parseFloat((bmr * 1.2).toFixed(2));
          break;
        case 'lightly active':
          this.caloriesResult = parseFloat((bmr * 1.375).toFixed(2));
          break;
        case 'moderately active':
          this.caloriesResult = parseFloat((bmr * 1.55).toFixed(2));
          break;
        case 'active':
          this.caloriesResult = parseFloat((bmr * 1.725).toFixed(2));
          break;
        case 'very active':
          this.caloriesResult = parseFloat((bmr * 1.9).toFixed(2));
          break;
        default:
          this.caloriesResult = null;
      }
    } else {
      this.caloriesResult = null;
    }
  }
}
