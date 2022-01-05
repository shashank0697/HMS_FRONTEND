import axios from 'axios';
const GUEST_GET_ALL_URL='http://localhost:8083/guest/get';
const GUEST_ADD_URL='http://localhost:8083/guest/add';
const GUEST_DELETE_URL='http://localhost:8083/guest/delete';

class GuestService{

    getAllGuests(){
        return axios.get(GUEST_GET_ALL_URL);
    }

    addGuests(guest){
        return axios.post(GUEST_ADD_URL,guest);
    }

    deleteGuest(guestId){
        return axios.delete(GUEST_DELETE_URL + '/' + guestId);
    }
}
export default new GuestService();