import React from 'react'
import { Box, Paper, Typography } from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import { blue } from '@material-ui/core/colors';
import { Link } from 'react-router-dom';
import Header from './Header';
import Footer from './Footer';

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
export default function MiddleLayout() {
    const classes=useStyles()

    return (
        <>
            <Header></Header>
        
        <div style={{maxWidth:"100%",width:"50%",marginTop:100}} className='container'> 
                {/* max-width: 100%;
                width: 50%;
                margin-top: 100px; */}
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    <Link className='roomLink' to='/middle/hroom' style={{color:"black",textDecoration:"none"}}>Room</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                        <Link className='guestLink' to='/middle/groom' style={{ color: "black", textDecoration: "none" }}>Guest</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                        <Link className='reservationLink' to='/middle/resroom' style={{ color: "black", textDecoration: "none" }}>Book Room</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                    {/* <Typography>Inventory</Typography> */}
                        <Link className='inventoryLink' to='/middle/iroom' style={{ color: "black", textDecoration: "none" }}>Inventory</Link>
                </Box>
            </Paper>
            <br></br><br></br>
            <Paper variant='outlined'>
                    <Box p={1} className={classes.boxBorder} style={{ textAlign: "center" }}>
                        <Link className='inventoryLink' to='/middle/sroom' style={{ color: "black", textDecoration: "none" }}>Staff</Link>
                </Box>
            </Paper>
           
        </div>
            <Footer></Footer>
        </>
    )
}
