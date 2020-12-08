package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador587")
public class Somador587 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
