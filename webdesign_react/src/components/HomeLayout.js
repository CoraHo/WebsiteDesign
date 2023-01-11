import React, {Component} from 'react';

class HomeLayout extends Component {
    render() {
        return (
            <div className="layout-whole">
                <header className="layout-header">
                    <menu>
                        <a href="https://www.google.com/"> ICON </a>
                        <a href="https://www.google.com/"> Galley </a>
                        <a href="https://www.google.com/"> Careers </a>
                        <a href="https://www.google.com/"> Contact Us </a>
                        {/*<div className="layout-separation"></div>*/}
                        <a href="https://www.google.com/"> 繁體 </a>
                        <a href="https://www.google.com/"> 简体 </a>
                        <a href="https://www.google.com/"> English </a>
                        <a href="https://www.google.com/"> Facebook </a>
                        <a href="https://www.google.com/"> Instagram </a>
                    </menu>
                </header>
                <div className="layout-main">
                    <div className="layout-main-ho">
                        <h1>ABOUT US</h1>
                        <p>NAMI</p>
                        <p>Board of Directors</p>
                        <p>Management</p>
                    </div>

                    <div className="layout-main-ho">
                        <h1>R & D</h1>
                        <p>R & D Focus</p>
                        <p>R & D Projects</p>
                        <p>Patents</p>
                    </div>

                    <div className="layout-main-ho">
                        <h1>COLLABORATION</h1>
                        <p>Opportunities & Benefits</p>
                        <p>Mode of Collaboration</p>
                        <p>Ready-to-License Technologies</p>
                        <p>Commercialized Technologies</p>
                    </div>

                    <div className="layout-main-ho">
                        <h1>NEWS & EVENTS</h1>
                        <p>NAMI Highlights</p>
                        <p>Awards</p>
                        <p>News</p>
                        <p>Events</p>
                    </div>
                </div>
            </div>

        );
    }
}

export default HomeLayout;