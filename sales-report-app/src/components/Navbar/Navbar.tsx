import { AppBar } from "@mui/material";
import Typography from "@mui/material/Typography";
import Toolbar from "@mui/material/Toolbar";

export function Navbar() {
  return (
    <AppBar position="static" color="primary" enableColorOnDark>
      <Toolbar>
        <Typography variant="h6" noWrap component="div" sx={{ width: 300 }}>
          Menu
        </Typography>
        <Typography variant="h6" noWrap component="div" sx={{ margin: '0 auto' }}>
          Sales Report
        </Typography>
        <Typography variant="h6" noWrap component="div" sx={{ width: 300, textAlign: 'end' }}>
          Sillas Cavalcante
        </Typography>
      </Toolbar>
    </AppBar>
  );
}
