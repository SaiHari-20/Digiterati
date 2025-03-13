import { Component } from '@angular/core';

interface Workout {
  id: number;
  name: string;
  equipment: string;
  experienceLevel: string;
  imageUrl: string;
  focus: string; // Added focus field
}

@Component({
  selector: 'app-chest',
  templateUrl: './chest.component.html',
  standalone: false,
  styleUrls: ['./chest.component.css']
})
export class ChestComponent {
  chestWorkouts: Workout[] = [
    {
      id: 1,
      name: 'Bench Press',
      equipment: 'Barbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/barbell-bench-press_0.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 2,
      name: 'Incline Dumbbell Press',
      equipment: 'Dumbbells',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/incline-dumbbell-bench-press_0.jpg',
      focus: 'Upper Chest'
    },
    {
      id: 3,
      name: 'Push-Ups',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/push-ups.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 4,
      name: 'Dips',
      equipment: 'Parallel Bars',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/chest-dip.jpg',
      focus: 'Lower Chest'
    },
    {
      id: 5,
      name: 'Cable Fly',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/standing-cable-fly1.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 6,
      name: 'Decline Bench Press',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/decline-bench-press-1.jpg',
      focus: 'Lower Chest'
    },
    {
      id: 7,
      name: 'Pec Deck Machine',
      equipment: 'Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/machine-fly.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 8,
      name: 'Dumbbell Fly',
      equipment: 'Dumbbells',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/dumbbell-fly.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 9,
      name: 'Chest Press Machine',
      equipment: 'Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/machine-bench-press_0.jpg',
      focus: 'Middle Chest'
    },
    {
      id: 10,
      name: 'Dumbbell Pullover',
      equipment: 'Dumbbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/dumbbell-pullover.jpg',
      focus: 'Upper Chest'
    }
  ];
}
