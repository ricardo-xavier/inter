package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1249")
public class Somador1249 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
