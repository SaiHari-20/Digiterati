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
  bicepsWorkouts: workout[] = [
    {
      id: 1,
      name: 'Barbell Curl',
      equipment: 'Barbell',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/barbell-curl.jpg',
      focus: 'Biceps'
    },
    {
      id: 2,
      name: 'Dumbbell Curl',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/standing-dumbbell-curl.jpg?itok=Kj5-H30y',
      focus: 'Biceps'
    },
    {
      id: 3,
      name: 'Hammer Curl',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/standing-hammer-curl.jpg?itok=EdRPUEKJ',
      focus: 'Biceps & Forearms'
    },
    {
      id: 4,
      name: 'Preacher Curl',
      equipment: 'EZ Bar',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/ez-bar-preacher-curl.jpg?itok=QzPp8o65',
      focus: 'Biceps'
    },
    {
      id: 5,
      name: 'Concentration Curl',
      equipment: 'Dumbbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-concentration-curl.jpg',
      focus: 'Biceps'
    },
    {
      id: 6,
      name: 'Cable Biceps Curl',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/two-arm-low-pulley-cable-curl.jpg?itok=RCuqYDyM',
      focus: 'Biceps'
    },
    {
      id: 7,
      name: 'Incline Dumbbell Curl',
      equipment: 'Dumbbells',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/incline-dumbbell-curl-thumb.jpg',
      focus: 'Biceps'
    },
    {
      id: 8,
      name: 'Spider Curl',
      equipment: 'Dumbbells',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/styles/800x500/public/spider-curl.jpg?itok=36jN7mmc',
      focus: 'Biceps & Forearms'
    },
    {
      id: 9,
      name: 'Drag Curl',
      equipment: 'Barbell or Dumbbells',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/dumbbell-drag-curl.jpg',
      focus: 'Biceps'
    },
    {
      id: 10,
      name: 'Zottman Curl',
      equipment: 'EZ Bar',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-zottman-curl.jpg',
      focus: 'Biceps & Forearms'
    }
];


}
