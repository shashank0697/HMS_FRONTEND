import React from 'react';
// import './App.css';
// import './index';
import phone from './Images/phone.png';
import email from './Images/email.png';
import address from './Images/address.png';
import Header from './Header';
import Footer from './Footer';


const Contact=()=>{
    return (
        <>
        <Header></Header>
        <div className="contact_info" style={{marginTop:100}}>
        <h1 className="contact_heading">Contact Us</h1>
            <div className="container-fluid">
                <div className="row">
                    <div className="col-lg-10 offset-lg-1 d-flex justify-content-between">
                        {/* for phone */}
                        <div className="contact_info_item d-flex justify-content-start align-items-center">
                            <img src={phone} alt="phone"/>
                            <div className="contact_info_content">
                                <div className="contact_info_title">
                                    Phone
                                </div>
                                <div className="contact_info_text">
                                    +91 1234567890
                                </div>
                            </div>
                        </div>
                        {/* for email */}
                        <div className="contact_info_item d-flex justify-content-start align-items-center">
                            <img src={email} alt="phone"/>
                            <div className="contact_info_content">
                                <div className="contact_info_title">
                                    Email
                                </div>
                                <div className="contact_info_text">
                                    abc@gmail.com
                                </div>
                            </div>
                        </div>
                        {/* for address */}
                        <div className="contact_info_item d-flex justify-content-start align-items-center">
                            <img src={address} alt="phone"/>
                            <div className="contact_info_content">
                                <div className="contact_info_title">
                                    Address
                                </div>
                                <div className="contact_info_text">
                                    4B/8 mumbai,Maharashtra,India
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        {/* contact form */}
        <div className="contact_form">
            <div className="contact_container">
                <div className="row">
                    <div className="col-lg-10 offset-lg-1">
                        <div className="contact_form_container py-4">
                            <div className="contact_form_title">
                                <h1>Get In Touch</h1>
                            </div>
                            <form  id="contact_form">
                                <div className="contact_form_name d-flex justify-content-between align-items-between">
                                    <input  type="text" id="contact_form_name" 
                                    className="contact_form_name input_field" placeholder="Your Name" required="true"/>
                                     <input  type="email" id="contact_form_email" 
                                    className="contact_form_email input_field" placeholder="Your Email" required="true"/>
                                    <input  type="number" id="contact_form_phone" 
                                    className="contact_form_phone input_field" placeholder="Your Phone Number" required="true"/>
                                </div>
                                <div className="contact_form_text mt-4" >
                                        <textarea className="text_field contact_form_message" id="" cols="90" rows="10" placeholder="Message">
                                    </textarea>
                                </div>
                                <div className="contact_form_button">
                                    <button type="submit" className="button contact_form_submit">Send Message</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <Footer></Footer>
        </>
    )
}
export default Contact;