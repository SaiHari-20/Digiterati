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

  legWorkouts: workout[] = [
    {
      id: 1,
      name: 'Squats',
      equipment: 'Barbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/field/feature-image/workout/larger-legs-thumb_0.jpg',
      focus: 'Quads, Glutes, Hamstrings'
    },
    {
      id: 2,
      name: 'Leg Press',
      equipment: 'Leg Press Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/field/feature-image/workout/leg-day-carnage-workout.jpg',
      focus: 'Quads, Hamstrings, Glutes'
    },
    {
      id: 3,
      name: 'Lunges',
      equipment: 'Dumbbells',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/field/feature-image/workout/6_leg_exercises_-_800x500.jpg',
      focus: 'Quads, Glutes, Hamstrings'
    },
    {
      id: 4,
      name: 'Romanian Deadlift',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://img.mensxp.com/media/content/2023/Feb/personal-trainer-focusing-his-deadlift-1_63f359d1a588f.jpeg?w=780&h=585&cc=1',
      focus: 'Hamstrings, Glutes'
    },
    {
      id: 5,
      name: 'Leg Curl',
      equipment: 'Leg Curl Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.shopify.com/s/files/1/0449/8453/3153/files/leg_curl.jpg?v=1739000697',
      focus: 'Hamstrings'
    },
    {
      id: 6,
      name: 'Leg Extension',
      equipment: 'Leg Extension Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://149874912.v2.pressablecdn.com/wp-content/uploads/2024/08/leg-press-vs-leg-extension-for-quads.jpg',
      focus: 'Quads'
    },
    {
      id: 7,
      name: 'Bulgarian Split Squat',
      equipment: 'Dumbbells',
      experienceLevel: 'Advanced',
      imageUrl: 'https://images.squarespace-cdn.com/content/v1/5750d5129f72662d66448028/1513970916742-K9JT5WOUTTZY23155ICN/Bulgarian+Squat.jpg?format=1500w',
      focus: 'Quads, Glutes'
    },
    {
      id: 8,
      name: 'Calf Raises',
      equipment: 'Machine or Bodyweight',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/seated-calf-raise-1.jpg',
      focus: 'Calves'
    },
    {
      id: 9,
      name: 'Step-Ups',
      equipment: 'Dumbbells or Bodyweight',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://app-media.fitbod.me/v2/128/images/landscape/0_960x540.jpg',
      focus: 'Quads, Glutes'
    },
    {
      id: 10,
      name: 'Sumo Deadlift',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/sumo-deadlift-1.jpg',
      focus: 'Glutes, Hamstrings, Quads'
    }
];


}
