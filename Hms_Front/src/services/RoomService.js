import axios from 'axios';
const ROOM_GET_ALL_URL='http://localhost:8082/room/get';
const ROOM_ADD_URL='http://localhost:8082/room/add';
const ROOM_DELETE_URL='http://localhost:8082/room/delete';
const ROOM_AVAILABLE='http://localhost:8082/room/search';

class RoomService{

    getAllRooms(){
        return axios.get(ROOM_GET_ALL_URL);
    }

    addRooms(room){
        return axios.post(ROOM_ADD_URL,room);
    }

    deleteRoom(roomId){
        return axios.delete(ROOM_DELETE_URL + '/' + roomId);
    }

    getAvailableRooms(roomAvail){
        return axios.get(ROOM_AVAILABLE + '/' + roomAvail);
    }
}
export default new RoomService();