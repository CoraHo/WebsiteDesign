import React, {Component} from 'react';

class HomeLayout extends Component {
    render() {
        return (
            <div className="layout-whole">
                <header className="layout-header">
                    <menu>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> ICON </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> Galley </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> Careers </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> Contact Us </a>
                        </div>

                        <div className="layout-separation"></div>

                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> 繁體 </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> 简体 </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> English </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> Facebook </a>
                        </div>
                        <div className="layout-header-link">
                            <a href="src/components/layout/HomeLayout"> Instagram </a>
                        </div>

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