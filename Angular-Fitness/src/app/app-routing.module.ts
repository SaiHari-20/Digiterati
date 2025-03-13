import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { CalculatorsComponent } from './pages/calculators/calculators.component';
import { WorkoutListComponent } from './pages/workout-list/workout-list.component';
import { WorkoutPlansComponent } from './pages/workout-plans/workout-plans.component';
import { LoginComponent } from './common/login/login.component';
import { ChestComponent } from './pages/workout-list/chest/chest.component';
import { TricepsComponent } from './pages/workout-list/triceps/triceps.component';
import { BackComponent } from './pages/workout-list/back/back.component';
import { BicepsComponent } from './pages/workout-list/biceps/biceps.component';
import { AbsComponent } from './pages/workout-list/abs/abs.component';
import { CardioComponent } from './pages/workout-list/cardio/cardio.component';
import { ShouldersComponent } from './pages/workout-list/shoulders/shoulders.component';
import { LegsComponent } from './pages/workout-list/legs/legs.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'calculators', component: CalculatorsComponent },
  {
    path: 'workout-list',
    component: WorkoutListComponent,
    children: [
      { path: 'chest', component: ChestComponent },
      { path: 'triceps', component: TricepsComponent },
      { path: 'back', component: BackComponent },
      { path: 'biceps', component: BicepsComponent },
      { path: 'shoulders', component: ShouldersComponent },
      { path: 'legs', component: LegsComponent },
      { path: 'abs', component: AbsComponent },
      { path: 'cardio', component: CardioComponent },
    ],
  },
  { path: 'workout-plans', component: WorkoutPlansComponent },
  { path: 'login', component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
