import { Component } from '@angular/core';
import { ApiService } from '../../../api.service';
import { workout } from '../../../workout';

@Component({
  selector: 'app-back',
  standalone: false,
  templateUrl: './back.component.html',
  styleUrl: './back.component.css'
})
export class BackComponent {

  backWorkouts: workout[] = [
    {
      id: 1,
      name: 'Pull-Ups',
      equipment: 'Pull-Up Bar',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://image.tuasaude.com/media/article/fg/kb/treino-costas_57723.jpg?width=936&height=624',
      focus: 'Upper Back'
    },
    {
      id: 2,
      name: 'Deadlifts',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpBccblQRUwBQLQZAlAy-pIerb-zW2X8SR6Q&s',
      focus: 'Lower Back'
    },
    {
      id: 3,
      name: 'Bent-Over Rows',
      equipment: 'Barbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://image.tuasaude.com/media/article/jp/sg/treino-costas_57726.jpg?width=936&height=624',
      focus: 'Middle Back'
    },
    {
      id: 4,
      name: 'Lat Pulldown',
      equipment: 'Cable Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://image.tuasaude.com/media/article/io/kc/treino-costas_39675.jpg?width=936&height=624',
      focus: 'Lats'
    },
    {
      id: 5,
      name: 'Seated Cable Row',
      equipment: 'Cable Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://image.tuasaude.com/media/article/lh/xe/back-workout_40109.jpg?width=936&height=624',
      focus: 'Middle Back'
    },
    {
      id: 6,
      name: 'T-Bar Row',
      equipment: 'Barbell',
      experienceLevel: 'Advanced',
      imageUrl: 'https://image.tuasaude.com/media/article/rq/uy/treino-costas_57724.jpg?width=936&height=624',
      focus: 'Middle Back'
    },
    {
      id: 7,
      name: 'Face Pulls',
      equipment: 'Cable Machine',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/cable-face-pull.jpg',
      focus: 'Upper Back'
    },
    {
      id: 8,
      name: 'Single-Arm Dumbbell Row',
      equipment: 'Dumbbell',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://image.tuasaude.com/media/article/wv/no/treino-costas_57722.jpg?width=936&height=624',
      focus: 'Lats'
    },
    {
      id: 9,
      name: 'Reverse Fly',
      equipment: 'Dumbbells',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/machine-reverse-fly.jpg',
      focus: 'Upper Back'
    },
    {
      id: 10,
      name: 'Hyperextensions',
      equipment: 'Roman Chair',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.muscleandstrength.com/sites/default/files/hyperextensions.jpg',
      focus: 'Lower Back'
    }
];


}
