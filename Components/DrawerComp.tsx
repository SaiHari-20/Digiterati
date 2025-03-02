import {
  Box,
  Flex,
  IconButton,
  Drawer,
  DrawerOverlay,
  DrawerContent,
  DrawerCloseButton,
  DrawerHeader,
  DrawerBody,
  useDisclosure,
  Button,
  VStack,
  Image,
  HStack,
  Menu,
  MenuButton,
  MenuList,
  MenuItem,
} from "@chakra-ui/react";
import { ChevronDownIcon, HamburgerIcon } from "@chakra-ui/icons";
import {
  FaHome,
  FaHeart,
  FaGamepad,
  FaAward,
  FaServer,
  FaShapes,
} from "react-icons/fa"; // Import icons
import Logo2 from "../assets/Logo2.png";

function NavbarWithDrawer() {
  const { isOpen, onOpen, onClose } = useDisclosure(); // Manage drawer state

  return (
    <>
      {/* Navbar */}
      <Flex
        as="nav"
        bg="black"
        p={4}
        justify="space-between"
        align="center"
        color="white"
      >
        <HStack spacing={5}>
          <Image src={Logo2} alt="Logo" boxSize={"75px"} />
          <Box fontSize="2xl" fontWeight="bold" color={"whitesmoke"}>
            RETRO GAME STORE - TIME TO PLAY THE GAME !
          </Box>
        </HStack>

        <IconButton
          borderWidth={2}
          icon={<HamburgerIcon />}
          variant="outline"
          colorScheme="white"
          onClick={onOpen}
          aria-label="Open Menu"
          size={"lg"}
          marginRight={3}
          border={"none"}
        />
      </Flex>

      {/* Drawer */}
      <Drawer
        isOpen={isOpen}
        placement="right"
        onClose={onClose}
        colorScheme="black"
      >
        <DrawerOverlay />
        <DrawerContent bg="black" color="white">
          <DrawerCloseButton />
          <DrawerHeader>Menu</DrawerHeader>
          <DrawerBody>
            <VStack align="start" spacing={4}>
              <Button leftIcon={<FaHome />} w="full" onClick={onClose}>
                Home
              </Button>
              <Button leftIcon={<FaHeart />} w="full" onClick={onClose}>
                Wishlist
              </Button>
              <Button leftIcon={<FaGamepad />} w="full" onClick={onClose}>
                My Library
              </Button>
              <Button leftIcon={<FaAward />} w="full" onClick={onClose}>
                Best Of The Year
              </Button>
              <Button leftIcon={<FaServer />} w="full" onClick={onClose}>
                Platforms
              </Button>
              <Menu>
                <MenuButton
                  as={Button}
                  rightIcon={<ChevronDownIcon />}
                  backgroundColor={"blackalpha"}
                  width={"full"}
                >
                  Genre
                </MenuButton>
                <MenuList bg="black" color="white" border="none">
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'} bg='whitesmoke'>
                    Free Online Games
                  </MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'}>Action</MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'} bg='whitesmoke' >Shooter</MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'}>Adventure</MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'} bg='whitesmoke' >Puzzle</MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'}>Racing</MenuItem>
                  <MenuItem _hover={{ bg: "gray.700" }} color={'black'} bg='whitesmoke' >Sports</MenuItem>
                </MenuList>
              </Menu>
            </VStack>
          </DrawerBody>
        </DrawerContent>
      </Drawer>
    </>
  );
}

export default NavbarWithDrawer;
