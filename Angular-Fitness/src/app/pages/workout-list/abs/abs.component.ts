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

  absWorkouts: workout[] = [
    {
      id: 1,
      name: 'Crunches',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/ab-crunch.jpg',
      focus: 'Upper Abs'
    },
    {
      id: 2,
      name: 'Hanging Leg Raises',
      equipment: 'Pull-Up Bar',
      experienceLevel: 'Advanced',
      imageUrl: 'https://steelsupplements.com/cdn/shop/articles/shutterstock_775161919_1000x.jpg?v=1642058115',
      focus: 'Lower Abs'
    },
    {
      id: 3,
      name: 'Russian Twists',
      equipment: 'Medicine Ball',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://img.livestrong.com/640/cme-data/getty%2F51780883272c474c9265289477e58ef3.jpg',
      focus: 'Obliques'
    },
    {
      id: 4,
      name: 'Plank',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/plank.jpg',
      focus: 'Core'
    },
    {
      id: 5,
      name: 'Bicycle Crunches',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://steelsupplements.com/cdn/shop/articles/Bicycle_crunch_-_cover_-_shutterstock_1420680866_1000x.jpg?v=1670162703',
      focus: 'Obliques'
    },
    {
      id: 6,
      name: 'Cable Crunches',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://www.dmoose.com/cdn/shop/articles/1_f607c1e6-fb1a-45f8-bb2e-4dbf0ea4827f.jpg?v=1647865926',
      focus: 'Upper Abs'
    },
    {
      id: 7,
      name: 'Ab Rollouts',
      equipment: 'Ab Wheel',
      experienceLevel: 'Advanced',
      imageUrl: 'https://hips.hearstapps.com/hmg-prod/images/man-work-out-with-ab-roller-royalty-free-image-1569957706.jpg',
      focus: 'Core'
    },
    {
      id: 8,
      name: 'Mountain Climbers',
      equipment: 'Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://i.insider.com/61ddba921025b20018bb2d2c?width=1200&format=jpeg',
      focus: 'Core'
    },
    {
      id: 9,
      name: 'Hanging Knee Raises',
      equipment: 'Pull-Up Bar',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://s3assets.skimble.com/assets/52281/skimble-workout-trainer-exercise-hanging-knee-raises-pull-up-3_iphone.jpg',
      focus: 'Lower Abs'
    },
    {
      id: 10,
      name: 'Side Plank',
      equipment: 'Bodyweight',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://experiencelife.lifetime.life/wp-content/uploads/2021/07/bid-side-plank.jpg',
      focus: 'Obliques'
    }
];


}

