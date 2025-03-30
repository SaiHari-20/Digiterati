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

  tricepsWorkouts: workout[] = [
    {
      id: 1,
      name: 'Triceps Dips',
      equipment: 'Parallel Bars',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/tricep-dip.jpg?itok=4YoDP8uD',
      focus: 'Triceps'
    },
    {
      id: 2,
      name: 'Overhead Triceps Extension',
      equipment: 'Dumbbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-overhead-dumbbell-tricep-extension_0.jpg',
      focus: 'Triceps'
    },
    {
      id: 3,
      name: 'Triceps Pushdown',
      equipment: 'Cable Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/rope-tricep-extension-1.jpg',
      focus: 'Triceps'
    },
    {
      id: 4,
      name: 'Close-Grip Bench Press',
      equipment: 'Barbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/close-grip-barbell-bench-press.jpg',
      focus: 'Triceps'
    },
    {
      id: 5,
      name: 'Skull Crushers',
      equipment: 'EZ Curl Bar',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/ez-bar-skullcrusher_0.jpg',
      focus: 'Triceps'
    },
    {
      id: 6,
      name: 'Diamond Push-Ups',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/close-grip-push-up.jpg?itok=OLU5dArI',
      focus: 'Triceps'
    },
    {
      id: 7,
      name: 'Kickbacks',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/dumbbell-tricep-kickback.jpg?itok=Lj4skmNj',
      focus: 'Triceps'
    },
    {
      id: 8,
      name: 'Bench Dips',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/bench-dip.jpg?itok=x4U98F1X',
      focus: 'Triceps'
    },
    {
      id: 9,
      name: 'One Arm Triceps Extension',
      equipment: 'Dumbbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/standing-bent-over-tricep-dumbbell-kickback.jpg',
      focus: 'Triceps'
    },
    {
      id: 10,
      name: 'Rope Triceps Pushdown',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/rope-tricep-extension-1.jpg',
      focus: 'Triceps'
    }
];


}
