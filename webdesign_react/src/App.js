import './App.css';
import {Component} from "react";
import store from "./store";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import {Provider} from "react-redux";
import AboutUs from "./components/company/AboutUs";
import CreateCompany from "./components/setUp/CreateCompany";
import CreateStaff from "./components/setUp/CreateStaff";
import Dashboard from "./components/Dashboard";

class App extends Component {
  render() {
    return (
      <Provider store={store}>
        <Router>
          <Routes>
            <Route path="" element=<Dashboard/> />
            <Route path="/setup/company" element={<CreateCompany/>} />
            <Route path={"/setup/staff/:companyName"} element={<CreateStaff/>} />
            <Route path="/:companyName/about" element={<AboutUs/>} />
          </Routes>
        </Router>
      </Provider>
    );
  }
}

export default App;
