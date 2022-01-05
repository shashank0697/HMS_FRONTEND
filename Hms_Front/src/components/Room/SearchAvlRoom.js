import React,{useState} from 'react'
import { TextField } from '@material-ui/core'
import { Button } from '@material-ui/core'
import { makeStyles } from '@material-ui/core'
import RoomService from '../../services/RoomService'
import { Link } from 'react-router-dom'
import Header from '../Header'
import Footer from '../Footer'


const useStyles=makeStyles({
    search:{
        width:1000,
    }
})


export default function SearchAvlRoom() {
    
    const classes=useStyles()
    const [Rooms, setRooms] = useState([]);
    const [roomAvailable, setRoomAvailable] = useState('');
    const getAvailRooms=()=>{
        RoomService.getAvailableRooms(roomAvailable).then((response)=>{
            setRooms(response.data)
            console.log(response.data)
        }).catch(error => {
            console.log(error);
        })
    };
    return (
        <>
        <Header></Header>
            <div style={{marginTop:100, maxWidth: "100%", width: "80%" }} className='container'>
           <br></br><br></br>
           <h1>Search for Rooms</h1> 
           <TextField variant="outlined" label="Search Rooms" placeholder='Enter true for searching available rooms'
                className={classes.search} value={roomAvailable} onChange={(e)=>setRoomAvailable(e.target.value)}>
            </TextField>
            <br></br><br></br>
            <Button variant='contained' onClick={()=>getAvailRooms()}>Search Room</Button>&nbsp;&nbsp;&nbsp;
            <Button variant='outlined'>Clear</Button>

            <div className="container">
        <br></br>
        <br></br>
        <h1>List Of Rooms Available</h1>

        <br></br>
        <br></br>
        <div>
          <div>
            <table>
              <thead>
                <tr>
                    <th>Room Number</th>
                        <th>Room Type</th>
                        <th>Room Rent</th>
                        <th>Room Available</th>
                        <th>Actions</th>
                </tr>
              </thead>
              <tbody>
              {
                        Rooms.map(
                            roomDetails=>
                                <tr key={roomDetails.roomId}>
                                    <td>{roomDetails.roomId}</td>
                                    <td>{roomDetails.roomType}</td>
                                    <td>{roomDetails.roomRent}</td>
                                    {/* <td>{roomDetails.roomAvailable}</td> */}
                                    <td>{String(roomDetails.roomAvailable)}</td>
                                    <td>
                                        <Button variant='outlined' color='secondary'>Delete</Button>
                                        &nbsp;&nbsp;
                                        <Button variant='outlined' color='primary'>
                                            <Link to='/middle/groom/addGuest'>Add Guest</Link>
                                        </Button>
                                    </td>
                                </tr>
                        )
                    }
              </tbody>
            </table>
          </div>
        </div>
        </div>
        </div>
        <Footer></Footer>
        </>
    )
}
