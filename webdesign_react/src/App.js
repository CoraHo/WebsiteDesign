import './App.css';
import {Component} from "react";
import store from "./store";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import {Provider} from "react-redux";
import HomeLayout from "./components/layout/HomeLayout";
import AboutUs from "./components/company/AboutUs";

class App extends Component {
  render() {
    return (
      <Provider store={store}>
        <Router>
          <HomeLayout/>
          <Routes>
            <Route path="/about/:companyName" element={<AboutUs/>}/>
          </Routes>
        </Router>
      </Provider>
    );
  }
}

export default App;
