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

  cardioWorkouts: workout[] = [
    {
      id: 1,
      name: 'Running',
      equipment: 'None',
      experienceLevel: 'Beginner',
      imageUrl: 'https://cdn.shopify.com/s/files/1/0603/7543/3450/files/building-abs-while-running_1024x1024.jpg?v=1641648707',
      focus: 'Full Body & Endurance'
    },
    {
      id: 2,
      name: 'Jump Rope',
      equipment: 'Jump Rope',
      experienceLevel: 'Beginner',
      imageUrl: 'https://www.usatoday.com/gcdn/-mm-/d8d0774057d19139d16e6ede624d76e89947662d/c=1-0-1365-767/local/-/media/2022/04/06/USATODAY/usatsports/imageForEntry6-rSS.jpg?width=660&height=371&fit=crop&format=pjpg&auto=webp',
      focus: 'Full Body & Coordination'
    },
    {
      id: 3,
      name: 'Cycling',
      equipment: 'Bicycle',
      experienceLevel: 'Beginner',
      imageUrl: 'https://img.freepik.com/free-photo/people-doing-indoor-cycling_23-2149270249.jpg',
      focus: 'Legs & Endurance'
    },
    {
      id: 4,
      name: 'Rowing Machine',
      equipment: 'Rowing Machine',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://sfhealthtech.com/cdn/shop/articles/10_Ways_Rowing_Machines_Can_Benefit_Your_Health.webp?v=1715158879',
      focus: 'Back & Cardio'
    },
    {
      id: 5,
      name: 'Burpees',
      equipment: 'None',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://hips.hearstapps.com/hmg-prod/images/athletes-doing-burpee-exercise-in-crossfit-gym-royalty-free-image-1576763992.jpg?crop=1.00xw:0.736xh;0,0&resize=300:*',
      focus: 'Full Body'
    },
    {
      id: 6,
      name: 'Mountain Climbers',
      equipment: 'None',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://i.insider.com/61ddba921025b20018bb2d2c?width=1200&format=jpeg',
      focus: 'Core & Cardio'
    },
    {
      id: 7,
      name: 'Stair Climbing',
      equipment: 'Stairs or Stair Climber',
      experienceLevel: 'Intermediate',
      imageUrl: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBbxfp1m_9XXDW2nWXbsnpQH-qWmT_xpqbCDh0ncmj-pgsmR4z-2zt51R0X7zOt3OguCw&usqp=CAU',
      focus: 'Legs & Cardio'
    },
    {
      id: 8,
      name: 'Jump Squats',
      equipment: 'None',
      experienceLevel: 'Advanced',
      imageUrl: 'https://hips.hearstapps.com/hmg-prod/images/squat-tuck-jump-1604509465.jpg',
      focus: 'Legs & Explosiveness'
    },
    {
      id: 9,
      name: 'High Knees',
      equipment: 'None',
      experienceLevel: 'Advanced',
      imageUrl: 'https://media.istockphoto.com/id/1312141922/photo/strong-young-athlete-fit-man-running-in-fitness-gym-the-man-with-sportswear-showing-his.jpg?s=612x612&w=0&k=20&c=SlTmQW8HwSvFf-XqWeTS5jALreUftbuzyDcFeTsXpcE=',
      focus: 'Legs & Cardio'
    },
    {
      id: 10,
      name: 'Box Jumps',
      equipment: 'Plyometric Box',
      experienceLevel: 'Advanced',
      imageUrl: 'https://www.eatthis.com/wp-content/uploads/sites/4/2022/07/man-box-jump.jpg?quality=82&strip=1',
      focus: 'Legs & Explosiveness'
    }
];


}
