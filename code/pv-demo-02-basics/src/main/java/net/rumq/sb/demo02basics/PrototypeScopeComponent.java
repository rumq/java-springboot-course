package net.rumq.sb.demo02basics;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Prototype scope means that a new bean instance is created every time a
 * dependency is injected.
 */
@Component
@Scope("prototype")
public class PrototypeScopeComponent {
    
        public PrototypeScopeComponent() {
            System.out.println("PrototypeScopeComponent created " + this.hashCode());
        }
    
        @Override
        public String toString() {
            
            return "Hello from PrototypeScopeComponent " + this.hashCode() ;
        }
}
