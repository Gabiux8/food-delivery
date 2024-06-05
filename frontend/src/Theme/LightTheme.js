const { createTheme } = require("@mui/material");

export const LightTheme = createTheme({
  palette: {
    mode: "light",
    primary: {
      main: "#ff0000",
    },
    secondary: {
      main: "#F2F7F2",
    },
    light: {
      main: "#C2B97F",
    },
    background: {
      main: "#BCAA99",
      default: "#F5E9D3",
      paper: "#F5E9D3",
    },
    textColor: {
      main: "#706e6e",
    },
  },
});
