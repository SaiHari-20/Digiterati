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
  shoulderWorkouts: workout[] = [
    {
      id: 1,
      name: 'Overhead Shoulder Press',
      equipment: 'Barbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/military-overhead-press.jpg',
      focus: 'Front Delts, Overall Shoulders'
    },
    {
      id: 2,
      name: 'Dumbbell Shoulder Press',
      equipment: 'Dumbbells',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-dumbbell-press-1.jpg',
      focus: 'Front Delts, Overall Shoulders'
    },
    {
      id: 3,
      name: 'Lateral Raises',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/dumbbell-lateral-raise.jpg',
      focus: 'Side Delts'
    },
    {
      id: 4,
      name: 'Front Raises',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/standing-dumbbell-front-raise.jpg?itok=XYkinlJy',
      focus: 'Front Delts'
    },
    {
      id: 5,
      name: 'Reverse Pec Deck Fly',
      equipment: 'Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/machine-reverse-fly.jpg',
      focus: 'Rear Delts'
    },
    {
      id: 6,
      name: 'Arnold Press',
      equipment: 'Dumbbells',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-arnold-press-thumb.jpg',
      focus: 'Front Delts, Side Delts'
    },
    {
      id: 7,
      name: 'Face Pulls',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/cable-face-pull.jpg',
      focus: 'Rear Delts, Rotator Cuffs'
    },
    {
      id: 8,
      name: 'Shrugs',
      equipment: 'Dumbbells or Barbell',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/dumbbell-shrug.jpg',
      focus: 'Traps'
    },
    {
      id: 9,
      name: 'Cable Lateral Raises',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/single-arm-cable-lateral-raise.jpg',
      focus: 'Side Delts'
    },
    {
      id: 10,
      name: 'Upright Rows',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/cable-upright-row-1.jpg',
      focus: 'Side Delts, Traps'
    }
];

}
