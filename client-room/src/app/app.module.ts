import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateRoomComponent } from './room/service/room/create-room/create-room.component';
import { RoomDetailsComponent } from './room/service/room/room-details/room-details.component';
import { ClientRoomComponent } from './room/client-room/client-room.component';
import { UpdateRoomComponent } from './room/update-room/update-room.component';
import { RoomListComponent } from './room/room-list/room-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateRoomComponent,
    RoomDetailsComponent,
    ClientRoomComponent,
    UpdateRoomComponent,
    RoomListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
