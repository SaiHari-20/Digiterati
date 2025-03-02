import ButtonComp from "./Components/ButtonComp";
import NavbarComp from "./Components/NavbarComp";
import { Heading } from "@chakra-ui/react";
import Theme from "./Theme";
import CardComp from "./Components/CardComp";
import { Pagination } from "@mui/material";
import DrawerComp from "./Components/DrawerComp";
import Footer from "./Components/Footer";

function App() {
  return (
    <>
      <DrawerComp />
       {/* <ButtonComp /> */}
      <CardComp />
      <Footer />

    </>
  );
}
export default App;
