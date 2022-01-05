import React from 'react'
import { NavLink } from 'react-router-dom'
const Footer = () => {
    return (
        <>
        <footer>
        <div className="footer_area">
            <div className="footer_row">
                <div className="row d-flex justify-content-between">
                    <div className="col-xl-3 col-lg-3 col-md-4 col-sm-6">
                        <div className="single-footer-caption mb-30">
                            <div className="footer_logo">
                                 <NavLink className="footer_logo" to="/"><span>Hotel <span className="foot_logo">Grand</span></span></NavLink>
                            </div>
                            <div className="footer_social">
                                <li><NavLink to="#"><i class="display-flex-center zmdi zmdi-facebook"></i></NavLink></li>
                                <li><NavLink to="#"><i class="display-flex-center zmdi zmdi-twitter"></i></NavLink></li>
                                <li><NavLink to="#"><i class="display-flex-center zmdi zmdi-google"></i></NavLink></li>
                            </div>
                            <div className="footer_para">
                                <p>Copyright ©|All Rights Reserved</p>
                            </div>
                        </div>
                    </div>
                    <div className="col-xl-3 col-lg-3 col-md-3 col-sm-5">
                        <div className="single-footer-caption mb-30">
                        <div className="footer_title">
                            <h4>Quick Links</h4>
                            <ul>
                                <li><NavLink to="/">About Hotel Grand</NavLink></li>
                                <li><NavLink to="/">Our Best Rooms</NavLink></li>
                                <li><NavLink to="">Our Photo Gallery</NavLink></li>
                            </ul>
                        </div>
                        </div>
                    </div>
                    <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3">
                        <div className="single-footer-caption mb-30">
                        <div className="footer_title">
                            <h4>Reservations</h4>
                            <ul>
                                <li>Tel:+91 1234567890</li>
                                <li>abc@gmail.com</li>
                            </ul>
                        </div>
                        </div>
                    </div>
                    <div className="col-xl-3 col-lg-3 col-md-4  col-sm-5">
                        <div className="single-footer-caption mb-30">
                            <div className="footer_title">
                            <h4>Our Location</h4>
                            <ul>
                                <li>4B/8,Mumbai,Maharashtra,India</li>
                            </ul>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </footer>
        </>
    );
};

export default Footer;
