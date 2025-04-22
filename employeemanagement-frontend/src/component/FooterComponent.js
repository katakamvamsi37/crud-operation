import React from 'react'

const FooterComponent = () => {
    return (
        <div className='mb-1'>
            <footer className='footer text-center '>
                <span>All Right Reserved &copy; {new Date().getFullYear()}</span>
            </footer>
        </div>
    )
}

export default FooterComponent