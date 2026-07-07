import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Login from "./pages/Login";
import StudentRegister from "./pages/StudentRegister";
import RecruiterRegister from "./pages/RecruiterRegister";
import StudentDashboard from "./pages/StudentDashboard";
import RecruiterDashboard from "./pages/RecruiterDashboard";
import AdminDashboard from "./pages/AdminDashboard";
import CompanyDetails from "./components/CompanyDetails";
import ApplicationForm from "./pages/ApplicationForm";
import ResumeAnalyzer from "./pages/ResumeAnalyzer";
import MyApplications from "./pages/MyApplications";

function App() {
  return (
    <BrowserRouter>

      <Routes>

        <Route path="/" element={<Home />} />

        <Route path="/login" element={<Login />} />

        <Route
          path="/student-register"
          element={<StudentRegister />}
        />

        <Route
          path="/recruiter-register"
          element={<RecruiterRegister />}
        />

        <Route
          path="/student-dashboard"
          element={<StudentDashboard />}
        />

        <Route
          path="/company/:id"
          element={<CompanyDetails />}
        />

        <Route
          path="/apply/:id"
          element={<ApplicationForm />}
        />

        <Route
          path="/resume-analyzer"
          element={<ResumeAnalyzer />}
        />

        <Route
          path="/recruiter-dashboard"
          element={<RecruiterDashboard />}
        />

        <Route
          path="/admin-dashboard"
          element={<AdminDashboard />}
        />
        <Route
            path="/applications"
            element={<MyApplications />}
        />

      </Routes>

    </BrowserRouter>
  );
}

export default App;