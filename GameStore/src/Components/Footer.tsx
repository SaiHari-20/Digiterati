import { 
  Box, 
  Flex, 
  Image, 
  IconButton, 
  Drawer, 
  DrawerOverlay, 
  DrawerContent, 
  DrawerHeader, 
  DrawerBody, 
  DrawerCloseButton, 
  useDisclosure, 
  VStack, 
  Text 
} from "@chakra-ui/react";
import { HamburgerIcon } from "@chakra-ui/icons";

function Navbar() {
  const { isOpen, onOpen, onClose } = useDisclosure();

  return (
    <>
      {/* Navbar */}
      <Box as="footer" bg="black" color="white" textAlign="center" p="4">
        <Text>&copy; {new Date().getFullYear()} Retro Game Store. All Rights Reserved.</Text>
      </Box>
    </>
  );
}

export default Navbar;
