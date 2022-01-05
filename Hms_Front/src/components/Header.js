import React from 'react'
import { AppBar, Box } from '@material-ui/core';
import { Toolbar } from '@material-ui/core';
import { Typography } from '@material-ui/core';
import { Button } from '@material-ui/core';
import { makeStyles } from '@material-ui/core';
import { Link } from 'react-router-dom';
import "./Header.css";

const useStyles = makeStyles({
    title:{
        flexGrow:1
    },
    appBarBtn:{
        float:'right'
    }
})

export default function Header() {

    const classes=useStyles()
    return (
        <AppBar position="fixed" style={{marginBottom:200}}>
            
            <Toolbar>
                
            <Button color="inherit" className={classes.appBarBtn}><Link className={classes.appBarLink} style={{color:"white",textDecoration:"none"}} to='/'>Home</Link></Button>

                <Typography variant="h6" className={classes.title} style={{textAlign:"center"}}>
                    Hotel Management System
                </Typography>
                
                
                <Link to='/middle' style={{ color: "white", textDecoration: "none",margin:5 }}>Menu</Link>
                <Link to='/about' style={{ color: "white", textDecoration: "none",margin:5 }}>About</Link>
                <Link to='/contact' style={{ color: "white", textDecoration: "none",margin:5 }}>Contact</Link>
                {/* <Button color="inherit" className={classes.appBarBtn}>Login</Button> */}
            </Toolbar>
        </AppBar>
    )
}


