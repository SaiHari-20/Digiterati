import { Heading, HStack, Switch, useColorMode } from "@chakra-ui/react";

function DarkSwitch() {
  const { colorMode, toggleColorMode } = useColorMode();

  return (
    <HStack spacing={3}>
      <Heading as="h3" size="s" color={"black"}>
        Into The Dark{" "}
      </Heading>
      <Switch
        colorScheme="red"
        onChange={toggleColorMode}
        isChecked={colorMode === "dark"}
      ></Switch>
    </HStack>
  );
}

export default DarkSwitch;
