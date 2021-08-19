# clojure-coinbox

A demonstration of a simple coinbox for making change, written in clojure.

## Installation

Download from http://github.com/jos-eph/clojure-coinbox .

## Usage
With Leiningen installed, type `lein run` from the root directory.
Unit testing is available by running `lein test`.

As an alternative, you may uncomment the last line of core.clj and run the program
from there.

###Run a Binary
You may find a pre-made standalone binary in the folder `target/uberjar`. If present,
you may run it by switching to the root directory and typing
`java -jar target/uberjar/clojure-coinbox-0.1.0-SNAPSHOT-standalone.jar`.

To compile a standalone binary if not present, type `lein uberjar` from the root directory.

## License

    Copyright 2021

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.
    
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.
    
    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.