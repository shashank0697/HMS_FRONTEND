import React from 'react'
import { Box, Paper} from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import { blue } from '@material-ui/core/colors';
import { Link } from 'react-router-dom';
import Header from '../Header';
import Footer from '../Footer';

const useStyles = makeStyles((theme) =>({
    root:{
        margin:theme.spacing(1),
        width:theme.spacing(100),
        height:theme.spacing(25),
        paddingLeft:theme.spacing(30),
        paddingTop:theme.spacing(20)
    },
    boxBorder:{
        border:`3px solid ${blue[200]}`
    }
}))
export default function HomeRoom() {
    const classes=useStyles()

    return (
        <>
        <Header></Header>
            <div style={{ maxWidth: "100%", width: "50%", marginTop: 200 }} className='container'>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Add Rooms</Typography> */}
                        <Link className='addRoomLink' to='/middle/hroom/addRoom' style={{ color: "black", textDecoration: "none" }}>Add Rooms</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Get All Rooms Detail</Typography> */}
                        <Link className='getAllRoomLink' to='/middle/hroom/getAllRoom' style={{ color: "black", textDecoration: "none" }}>Rooms Detail</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Search Room</Typography> */}
                        <Link className='getAVailLink' to='/middle/hroom/getAvail' style={{ color: "black", textDecoration: "none" }}>Search Available Rooms</Link>
                </Box>
            </Paper>
        </div>
        <Footer></Footer>
        </>
    )
}
