package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1795")
public class Somador1795 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
