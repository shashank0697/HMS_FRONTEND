import React from 'react'
import { Box, Paper } from '@material-ui/core';
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
export default function HomeGuest() {
    const classes=useStyles()

    return (
        <>
        <Header></Header>
            <div style={{ maxWidth: "100%", width: "50%", marginTop: 100 }} className='container'>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Add Rooms</Typography> */}
                        <Link className='addGuestLink' to='/middle/groom/addGuest' style={{ color: "black", textDecoration: "none" }}>Add Guests</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Get All Rooms Detail</Typography> */}
                        <Link className='getAllGuestLink' to='/middle/groom/getAllGuest' style={{ color: "black", textDecoration: "none" }}> Guests Details</Link>
                </Box>
            </Paper>
        </div>
        <Footer></Footer>
        </> 
    )
}