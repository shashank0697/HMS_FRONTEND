import axios from 'axios';
const INVENTORY_GET_ALL_URL='http://localhost:8081/inventory/get';
const INVENTORY_ADD_URL='http://localhost:8081/inventory/add';
const INVENTORY_DELETE_URL='http://localhost:8081/inventory/delete';

class InventoryService{

    getAllInventory(){
        return axios.get(INVENTORY_GET_ALL_URL);
    }

    addInventory(inventory){
        return axios.post(INVENTORY_ADD_URL,inventory);
    }

    deleteInventory(inventoryId){
        return axios.delete(INVENTORY_DELETE_URL + '/' + inventoryId);
    }
}
export default new InventoryService();