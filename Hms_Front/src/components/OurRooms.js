import React from 'react'
import room1 from '../Images/singleRoom.jpg';
import room2 from '../Images/Double-Room.jpg';
import room3 from '../Images/Queen-Room.jpg';
import room4 from '../Images/King-Room.jpg';
import room5 from '../Images/Executive-suite-Room.jpg';
import room6 from '../Images/Junior-suite-Room.jpg';
import room7 from '../Images/presidential-suite.jpg';
import room8 from '../Images/murphy-rooms.jpg'
import room9 from '../Images/serviced-apartment.jpg';
const OurRooms = () => {
    return (
        <>
        <div className="our_room_container">
            <div className="our_room_heading">
                <h1 >Our Rooms</h1>
            </div>
            <div className="room_row">
                <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room1} alt="room1"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Single Room</h2>
                            <p>Rs. 399/Night**</p>
                        </div>
                    </div>
                </div>
                    <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room2}  alt="room2"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Double Room</h2>
                            <p>Rs. 499/Night**</p>
                        </div>
                    </div>
                </div>
                    <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room3}  alt="room3"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Queen Room</h2>
                            <p>Rs. 699/Night**</p>
                        </div>
                    </div>
                </div>
                    <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room4}  alt="room4"></img>
                        </div>
                        <div className="room_caption">
                            <h2>King Room</h2>
                            <p>Rs. 899/Night**</p>
                        </div>
                    </div>
                </div>
                 <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room5} alt="room5"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Executive Suite</h2>
                            <p>Rs. 999/Night**</p>
                        </div>
                    </div>
                </div>
                                <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room6}  alt="room6"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Junior Suite</h2>
                            <p>Rs. 1999/Night**</p>
                        </div>
                    </div>
                </div>
                    <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room7}  alt="room7"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Presidential Suite</h2>
                            <p>Rs. 2999/Night**</p>
                        </div>
                    </div>
                </div>
                    <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room8}  alt="room8"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Murphy Room</h2>
                            <p>Rs. 2500/Night**</p>
                        </div>
                    </div>
                </div>
                     <div className="col-xl-4 col-lg-6 col-md-6">
                    <div className="room mb-50">
                        <div className="room_image">
                            <img src={room9} alt="room9"></img>
                        </div>
                        <div className="room_caption">
                            <h2>Serviced Apartment</h2>
                            <p>Rs. 15000/Month**</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </>
    )
}
export default OurRooms
