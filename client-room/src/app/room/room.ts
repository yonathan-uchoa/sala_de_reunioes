import { Time } from "@angular/common"

export class Room{
    id: number;
    name: string;
    date: string;
    startHour: Time;
    endHour: Time;
    active: boolean;
}